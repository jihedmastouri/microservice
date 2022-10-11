const express = require("express");
const router = express.Router();
// const validator = require('../validator');

const {
  createRemb,
  getRembs,
  deleteXRemb,
  updateXRemb,
  getOneRemb,
} = require("../controllers/remb");

router.get("/", getRembs);
router.post("/post", createRemb);
router.delete("/delete/:id", deleteXRemb);
router.put("/update/:id", updateXRemb);
router.get("/:id", getOneRemb);

module.exports = router;
