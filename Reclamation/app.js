const express = require("express");
const app = express();
const mongoose = require("mongoose");
const morgan = require("morgan");
const bodyParser = require("body-parser");
const eurekaHelper = require("./eureka-helper");
const PORT = process.env.PORT || 8083;

//db connection
mongoose
  .connect(process.env.MONGO_URI, { useNewUrlParser: true })
  .then(() => console.log("DB Connected"));

mongoose.connection.on("error", (err) => {
  console.log(`DB connection error: ${err.message}`);
});

const recsRoutes = require("./routes/rec");

//middleware
app.use(morgan("dev"));
app.use(bodyParser.json());
// app.use(expressValidator());
app.use("/", recsRoutes);

eurekaHelper.registerWithEureka("recl-service", PORT);

app.listen(PORT, () => {
  console.log(`Server listening at port:${PORT}`);
});
