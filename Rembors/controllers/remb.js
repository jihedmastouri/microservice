const Remb = require("../model/remb");

exports.getRembs = (req, res) => {
  const rembs = Remb.find()
    .select("_id title body")
    .then((posts) => {
      res.json({ rembs });
    })
    .catch((err) => console.log(err));
};

exports.createRemb = (req, res) => {
  const remb = new remb(req.body);

  remb.save().then((result) => {
    res.json({
      remb: result,
    });
  });
};

exports.deleteXRemb = (req, res) => {
  const id = req.params.id;
  Remb.findByIdAndDelete(id)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};

exports.updateXRemb = (req, res) => {
  const id = req.params.id;
  Remb.findByIdAndUpdate(id, req.body)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};

exports.getOneRemb = (req, res) => {
  const id = req.params.id;
  Remb.findById(id)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};
