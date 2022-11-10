var express = require('express');
const watch_controlers= require('../controllers/watch'); 
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('watchs', { title: 'Search Results Watch' });
});

module.exports = router;

router.get('/', watch_controlers.watch_view_all_Page );