const Rec = require("../model/rec");

exports.getRecs = (req, res) => {
  Rec.find()
    .select("_id title body")
    .then((recs) => {
      res.json({ recs });
    })
    .catch((err) => console.log(err));
};

exports.createRec = (req, res) => {
  const rec = new Rec(req.body);
  rec.save().then((result) => {
    res.json({
      rec: result,
    });
  });
};

exports.deleteRec = (req, res) => {
  const id = req.params.id;
  Rec.findByIdAndDelete(id)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};

exports.updateRec = (req, res) => {
  const id = req.params.id;
  Rec.findByIdAndUpdate(id, req.body)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};

exports.getOneRec = (req, res) => {
  const id = req.params.id;
  Rec.findById(id)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};
