document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    if (form) {
        form.addEventListener('submit', function(event) {
            const username = document.querySelector('input[name="username"]').value.trim();
            const password = document.querySelector('input[name="password"]').value.trim();

            if (!username || !password) {
                alert('Please fill in both username and password.');
                event.preventDefault();
                return false;
            }
        });
    }
});
