function objectIdFromDate(date){
  return Math.floor(date.getTime() / 1000).toString(16) + "0000000000000000";
}
