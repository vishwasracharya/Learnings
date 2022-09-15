/**
 * Generate Random Email module
 * @module generateRandomEmail
 * @returns {string} - Returns a random email
 */
module.exports = () => `${Math.random().toString(36).substring(7)}@gmail.com`;
