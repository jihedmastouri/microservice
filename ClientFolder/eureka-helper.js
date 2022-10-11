const Eureka = require("eureka-js-client").Eureka;

exports.registerWithEureka = function (appName, PORT) {
  const client = new Eureka({
    instance: {
      app: appName,
      hostName: "localhost",
      ipAddr: "192.168.1.25",
      port: PORT,
      vipAddress: appName,
      dataCenterInfo: {
        name: "MyOwn",
      },
    },
    eureka: {
      serviceUrls: {
        default: ["http://localhost:8080/eureka/"],
      },
      maxRetries: 10,
      requestRetryDelay: 2000,
    },
  });

  client.logger.level("debug");

  function exitHandler(options, exitCode) {
    if (options.cleanup) {
    }
    if (exitCode || exitCode === 0) console.log(exitCode);
    if (options.exit) {
      client.stop();
    }
  }

  process.on("SIGINT", exitHandler.bind(null, { exit: true }));
};
