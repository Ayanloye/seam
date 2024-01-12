describe('template spec', () => {
    it('passes', () => {

        //Open browser and navigate to URL:https://patient-satisfaction.seamhealth.support
      cy.visit('https://patient-satisfaction.seamhealth.support')

        //Enter Valid Email Address
        cy.get('#signInEmail')
        .should('be.empty')
        .should('be.visible')
      cy.get('#signInEmail').type('xerelax126@roborena.com')

        //Enter Valid Password
    cy.get('#password').type('password')

    //Click on login
    cy.get('.login-text').click()

    //Click on Feedback
    cy.get('.items > .nav-links > :nth-child(2)').click()

    //Click on Complaint
    cy.get('.mb-2').click()

    //Click on Export
    cy.get('.export-complaints').click()

    //Click on Data Entry
    cy.get(':nth-child(1) > .custom-select').click()

    //Select Two months
    cy.get('.inprogress-status').click()

    cy.wait(2000)

    //Click on File Format
    cy.get(':nth-child(2) > .custom-select').click()
    
    cy.wait(2000)
    //Select Excel
    cy.get('.resolved-status').click()
    
    cy.wait(3000)
    //Click on download
    cy.get('#export-modal > .modal-dialog > #modal-content > .modal-footer > .modal-btn').click()
    })
  })