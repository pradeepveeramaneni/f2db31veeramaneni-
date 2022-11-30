const mongoose = require("mongoose") 
const watchSchema = mongoose.Schema({ 
    watch_brand: {type:String,minLength: 3},     
    watch_color: {type:String},
    watch_cost: { type: Number, min: 10, max: 1000 }
}) 
 
module.exports = mongoose.model("watch", watchSchema)