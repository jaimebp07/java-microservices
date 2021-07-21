const express = require('express');
const path = require('path');
const exphbs = require('express-handlebars');
const methodOverride = require('method-override');
const session = require('express-session');

//Initiliazations
const app = express();

//Settings
app.set('port', process.env.PORT || 3000);
app.set('views', path.join(__dirname, 'views'))
app.engine('.hbs', exphbs({
    defaultLayout: 'main',
    layoutsDir: path.join(app.get('views'), 'layouts'),
    partialsDir: path.join(app.get('views'), 'partials'),
    extname: '.hbs'
}));
app.set('view engine', '.hbs');

//Middlewares
app.use(express.urlencoded({extended: false})) //para entender los datos enviads por un formulario
app.use(methodOverride('_method'));//sirve para que los formularios puedan enviar otros tipos de metodos, no solemante get y post
app.use(session({
    secret: 'mysecretapp',
    resave: true,
    saveUninitialized: true
}));

//Global variables

// Routes
app.use(require('./routes/index'));
app.use(require('./routes/notes'));
app.use(require('./routes/users'));

// Static Files

// Server is listenning
app.listen(app.get('port'), () => {
    console.log('Server on port ', app.get('port'));
});