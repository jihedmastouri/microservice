const express = require('express');
const router = express.Router();
// const validator = require('../validator');

const { createFolder, getFolders, deleteFolder, updateFolder, getOneFolder } = require('../controllers/folder');

router.get('/', getFolders);
router.post('/post', createFolder);
router.delete('/delete/:id', deleteFolder);
router.put('/update/:id', updateFolder);
router.get('/:id', getOneFolder);


module.exports = router;