const mongoose = require("mongoose");

const postSchema = mongoose.Schema({
  date: {
    type: Date,
    required: true,
  },
  location: {
    type: String,
    required: true,
  },
  severity: {
    type: String,
    required: true,
  },
});

module.exports = mongoose.model("Accident", postSchema);
