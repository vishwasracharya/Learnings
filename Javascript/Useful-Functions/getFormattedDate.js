function formattedDate() {
    const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    let newMonth = months[oldDate.getMonth()];
    let newDate = oldDate.getDate() + ',';
    let newYear = oldDate.getFullYear();
    return [newMonth, newDate, newYear].join(' ');
}