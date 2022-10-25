const Client = require('../model/client');

exports.getClients = (req, res) => {
    const clients = Client.find().select('_id title body')
        .then(posts => {
            res.json({ clients });
        })
        .catch(err => console.log(err));
};

exports.createClient = (req, res) => {
    const client = new client(req.body);

    client.save().then(result => {
        res.json({
            client: result
        });
    });
}

exports.deleteXClient = (req, res) => {
    const id = req.params.id;
    Client.findByIdAndDelete(id)
        .then(result => {
            res.json({ result });
        })
        .catch(err => console.log(err));
};

exports.updateXClient = (req, res) => {
    const id = req.params.id;
    Client.findByIdAndUpdate(id, req.body)
        .then(result => {
            res.json({ result });
        })
        .catch(err => console.log(err));
};

exports.getOneClient = (req, res) => {
    const id = req.params.id;
    Client.findById(id)
        .then(result => {
            res.json({ result });
        })
        .catch(err => console.log(err));
};
