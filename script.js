document.addEventListener('DOMContentLoaded', () => {

    // --- Mobile Menu Logic ---
    // this makes the hamburger menu work
    const menuIcon = document.getElementById('menu-icon');
    const mobileMenu = document.getElementById('mobile-menu');
    const mobileNavLinks = document.querySelectorAll('.mobile-nav-link');

    // check if the menu icon and menu actually exist on the page.
    if (menuIcon && mobileMenu) {
        // when someone clicks the menu button...
        menuIcon.addEventListener('click', () => {
            // show or hide the menu
            mobileMenu.classList.toggle('open');
            // Change icon from the three lines to an 'x' and back.
            menuIcon.classList.toggle('bx-x'); 
        });
    }

    // this function closes the menu
    const closeMenu = () => {
        if (mobileMenu.classList.contains('open')) {
            mobileMenu.classList.remove('open');
            menuIcon.classList.remove('bx-x'); // change the icon back.
        }
    };

    // make it so when you click a link in the mobile menu, the menu closes.
    mobileNavLinks.forEach(link => {
        link.addEventListener('click', closeMenu);
    });

    
    // --- Fee Calculator Logic ---
    const feeForm = document.getElementById('fee-calculator-form');

    // make sure the form is on the page before we try to use it
    if (feeForm) {
        // listen for when the "Calculate Total" button is clicked
        feeForm.addEventListener('submit', (event) => {
            // stop the page from reloading when the button is clicked
            event.preventDefault();

            // Find all the course checkboxes that are currently checked
            const courseCheckboxes = document.querySelectorAll('.course-checkbox:checked');
            
            let subtotal = 0;
            // Loop through each checked box and add its price to the subtotal
            courseCheckboxes.forEach(checkbox => {
                subtotal = subtotal + parseFloat(checkbox.value);
            });
            
            // --- Discount Calculation ---
            // Made this an if/else so it's easier for me to read.
            let discount = 0;
            // if they pick 2 or more courses, give a 10% discount
            if (courseCheckboxes.length >= 2) {
                discount = subtotal * 0.10;
            } else {
                discount = 0;
            }
            const subtotalAfterDiscount = subtotal - discount;
            const vat = subtotalAfterDiscount * 0.15; // 15% VAT, standard stuff
            const total = subtotalAfterDiscount + vat;

            // get the spots on the page where i need to show the results
            const subtotalEl = document.getElementById('subtotal');
            const discountEl = document.getElementById('discount');
            const vatEl = document.getElementById('vat');
            const totalEl = document.getElementById('total');

            //put the calculated numbers on the page
            // .toFixed(2) makes sure it looks like money (e.g., R50.00)
            subtotalEl.textContent = `R${subtotal.toFixed(2)}`;
            discountEl.textContent = `-R${discount.toFixed(2)}`;
            vatEl.textContent = `R${vat.toFixed(2)}`;
            totalEl.textContent = `R${total.toFixed(2)}`;
        });
    }

});