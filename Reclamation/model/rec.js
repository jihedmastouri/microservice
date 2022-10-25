const mongoose = require("mongoose");

const recSchema = mongoose.Schema({
  fullName: {
    type: String,
    required: true,
  },
  phone: {
    type: String,
  },
  email: {
    type: String,
    required: true,
  },
  subject: {
    type: String,
  },
  content: {
    type: String,
    required: true,
  },
});

module.exports = mongoose.model("Rec", recSchema);
