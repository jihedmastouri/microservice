const mongoose = require('mongoose');

const postSchema = mongoose.Schema({
    fullName: {
        type: String,
        required: true
    },
    birthday: {
        type: String,
        required: true
    },
    phone: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true
    },
    country: {
        type: String,
    },
    FolderFk: {
        type: String,
        required: true
    }
});

module.exports = mongoose.model('Client', postSchema);