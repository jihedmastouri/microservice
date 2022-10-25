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
router.post("/", createRec);
router.delete("/:id", deleteRec);
router.put("/:id", updateRec);
router.get("/:id", getOneRec);

module.exports = router;
