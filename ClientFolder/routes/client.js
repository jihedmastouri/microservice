const express = require('express');
const router = express.Router();
// const validator = require('../validator');

const { createClient, getClients, deleteXClient, updateXClient, getOneClient } = require('../controllers/client');

router.get('/', getClients);
router.post('/post', createClient);
router.delete('/delete/:id', deleteXClient);
router.put('/update/:id', updateXClient);
router.get('/:id', getOneClient);


module.exports = router;