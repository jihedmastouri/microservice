const express = require("express");
const router = express.Router();

const {
  createRec,
  getRecs,
  deleteRec,
  updateRec,
  getOneRec,
} = require("../controllers/rec");

router.get("/", getRecs);
router.post("/post", createRec);
router.delete("/delete/:id", deleteRec);
router.put("/update/:id", updateRec);
router.get("/:id", getOneRec);

module.exports = router;
