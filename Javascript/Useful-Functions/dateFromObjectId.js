function dateFromObjectId(objectId) {
	return new Date(parseInt(objectId.substring(0, 8), 16) * 1000);
};
console.log(dateFromObjectId("507f1f77bcf86cd799439011"));
