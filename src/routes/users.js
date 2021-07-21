const router = require('express').Router();

router.get('/singin', (req, res) => {
    res.send('Ingresando a la app');
})

router.get('/singup', (req, res) => {
    res.send('Formulario de autenticacion');
})
module.exports = router;