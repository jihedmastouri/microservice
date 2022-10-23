const Eureka = require("eureka-js-client").Eureka;
const url_eureka = process.env.URL_EU || "localhost";
const hostname = process.env.HOSTNAME || "localhost";

exports.registerWithEureka = function (appName, PORT) {
  const client = new Eureka({
    instance: {
      app: appName,
      instanceId: "node1",
      hostName: "localhost",
      ipAddr: hostname,
      port: PORT,
      vipAddress: appName,
      dataCenterInfo: {
        name: "MyOwn",
      },
    },
    eureka: {
      serviceUrls: {
        default: [url_eureka],
      },
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

  client.on("deregistered", () => {
    process.exit();
    console.log("after deregistered");
  });

  client.on("started", () => {
    console.log("eureka host  " + eurekaHost);
  });

  process.on("SIGINT", exitHandler.bind(null, { exit: true }));
};
