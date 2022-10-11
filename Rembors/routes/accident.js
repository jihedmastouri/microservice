const express = require("express");
const router = express.Router();

const {
  createAccident,
  getAccidents,
  deleteAccident,
  updateAccident,
  getOneAccident,
} = require("../controllers/accident");

router.get("/", getAccidents);
router.post("/post", createAccident);
router.delete("/delete/:id", deleteAccident);
router.put("/update/:id", updateAccident);
router.get("/:id", getOneAccident);

module.exports = router;
