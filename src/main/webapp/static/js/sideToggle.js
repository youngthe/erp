document.addEventListener('DOMContentLoaded', () => {
    const salesToggle = document.getElementById('salesToggle');
    const salesMenu = document.getElementById('salesMenu');

    salesToggle.addEventListener('click', (e) => {
        if (salesMenu.style.display === 'none') {
            salesMenu.style.display = 'block';
        } else {
            salesMenu.style.display = 'none';
        }
    });
});