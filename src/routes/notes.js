const router = require('express').Router();

router.get('/notes', (req, res) => {
    res.send('notes de la base de datos');
})
module.exports = router;