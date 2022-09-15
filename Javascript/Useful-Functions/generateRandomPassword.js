/**
 * Generates a random password
 * @module generateRandomPassword
 * @returns {string} - Returns a random password
 */
module.exports = () => Math.random().toString(36).substring(2);
