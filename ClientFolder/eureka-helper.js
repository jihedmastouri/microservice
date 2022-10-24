const Eureka = require("eureka-js-client").Eureka;
const url_eureka = process.env.URL_EU || "localhost";
const hostname = process.env.HOSTNAME || "localhost";

exports.registerWithEureka = function (appName, PORT) {
  const client = new Eureka({
    instance: {
      app: appName,
      hostName: "localhost",
      instanceId: appName + hostname,
      ipAddr: hostname,
      port: PORT,
      vipAddress: appName,
      dataCenterInfo: {
        name: "MyOwn",
      },
    },
    eureka: {
      host: url_eureka,
      port: 8080,
      servicePath: "/eureka/apps/",
      maxRetries: 10,
      requestRetryDelay: 2000,
    },
  });

  client.logger.level("debug");

  client.start((error) => {
    console.log(error || "user service registered");
  });

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
