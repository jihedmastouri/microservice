const Folder = require('../model/folder');

exports.getFolders = (req, res) => {
    const folders = Folder.find().select('_id title body')
        .then(posts => {
            res.json({ folders });
        })
        .catch(err => console.log(err));
};

exports.createFolder = (req, res) => {
    const folder = new folders(req.body);
    folder.save().then(result => {
        res.json({
            folder: result
        });
    });
}

exports.deleteFolder = (req, res) => {
    const id = req.params.id;
    Folder.findByIdAndDelete(id)
        .then(result => {
            res.json({ result });
        })
        .catch(err => console.log(err));
};

exports.updateFolder = (req, res) => {
    const id = req.params.id;
    Folder.findByIdAndUpdate(id, req.body)
        .then(result => {
            res.json({ result });
        })
        .catch(err => console.log(err));
};

exports.getOneFolder = (req, res) => {
    const id = req.params.id;
    Folder.findById(id)
        .then(result => {
            res.json({ result });
        })
        .catch(err => console.log(err));
};
