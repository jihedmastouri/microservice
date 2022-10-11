const mongoose = require("mongoose");

const postSchema = mongoose.Schema({
  amount: {
    type: Number,
    required: true,
  },
  accidentFk: {
    type: String,
    required: true,
  },
  status: {
    type: String,
    required: true,
    enum: ["pending", "approved", "rejected"],
  },
  conter: {
    type: Number,
    required: true,
    nullable: true,
  },
});

module.exports = mongoose.model("Remb", postSchema);
