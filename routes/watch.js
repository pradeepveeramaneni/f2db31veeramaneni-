var express = require('express');
const watch_controlers= require('../controllers/watch'); 
var router = express.Router();
// A little function to check if we have an authorized user and continue on or
// redirect to login.
const secured = (req, res, next) => {
if (req.user){
return next();
}
req.session.returnTo = req.originalUrl;
res.redirect("/login");
}
router.get('/', watch_controlers.watch_view_all_Page );
/* GET detail watch page */
router.get('/detail', watch_controlers.watch_view_one_Page);
/* GET create watch page */
router.get('/create', secured, watch_controlers.watch_create_Page);
/* GET create update page */
router.get('/update', secured, watch_controlers.watch_update_Page);
/* GET delete watch page */
router.get('/delete', secured, watch_controlers.watch_delete_Page);

module.exports = router;