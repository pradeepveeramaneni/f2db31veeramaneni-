var express = require('express'); 
var router = express.Router(); 
 
// Require controller modules. 
var api_controller = require('../controllers/api'); 
var watch_controller = require('../controllers/watch'); 
 
/// API ROUTE /// 
 
// GET resources base. 
router.get('/', api_controller.api); 
 
/// COSTUME ROUTES /// 
 
// POST request for creating a watch.  
router.post('/watchs', watch_controller.watch_create_post); 
 
// DELETE request to delete watch. 
router.delete('/watchs/:id', watch_controller.watch_delete); 
 
// PUT request to update watch. 
router.put('/watchs/:id', watch_controller.watch_update_put); 
 
// GET request for one watch. 
router.get('/watchs/:id', watch_controller.watch_detail); 
 
// GET request for list of all watch items. 
router.get('/watchs', watch_controller.watch_list);

module.exports = router;