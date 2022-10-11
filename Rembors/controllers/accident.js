const Accident = require("../model/accident");

exports.getAccidents = (req, res) => {
  const accidents = Accident.find()
    .select("_id title body")
    .then((posts) => {
      res.json({ accidents });
    })
    .catch((err) => console.log(err));
};

exports.createAccident = (req, res) => {
  const accident = new Accident(req.body);
  accident.save().then((result) => {
    res.json({
      accident: result,
    });
  });
};

exports.deleteAccident = (req, res) => {
  const id = req.params.id;
  Accident.findByIdAndDelete(id)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};

exports.updateAccident = (req, res) => {
  const id = req.params.id;
  Accident.findByIdAndUpdate(id, req.body)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};

exports.getOneAccident = (req, res) => {
  const id = req.params.id;
  Accident.findById(id)
    .then((result) => {
      res.json({ result });
    })
    .catch((err) => console.log(err));
};
