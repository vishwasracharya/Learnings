/**
 * Decode JWT token module.
 * @module decodeJwtController
 * @param {string} token - JWT token
 * @returns {object} decoded - decoded JWT token
 */
const jwt = require('jsonwebtoken');

module.exports = (token) => {
  try {
    const decoded = jwt.verify(token, process.env.JWT_PRIVATE_KEY);
    return decoded;
  } catch (ex) {
    console.log(ex);
    return null;
  }
};
