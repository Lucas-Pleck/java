const hamburger = document.querySelector(".hamburger");
const navMenu = document.querySelector(".nav-menu");
const navLink = document.querySelectorAll(".nav-link");

hamburger.addEventListener("click", mobileMenu);

function mobileMenu() {
    hamburger.classList.toggle("active");
    navMenu.classList.toggle("active");
}

navLink.forEach(n => n.addEventListener("click", closeMenu));

function closeMenu() {
    hamburger.classList.remove("active");
    navMenu.classList.remove("active");
}

let announcementContainer=document.getElementById('announcementList');
const announceTemplate = document.querySelector('#announcementTemplate');
let getAnnouncementList = async () => {
			// par default fetch fait un get
			fetch('http://localhost:8080/api/announcement')
			// la réponse est un ReadableStream je la parse en json objet manipulable
				.then(response => response.json())
				// je convertis un objet json en chaine de caractères
				// pour l'insérer dans le innerHTML
				.then(announcements=>{
				    announcements.forEach(announcement=>createAnnouncementComponent(announcement));
				});
};

let createAnnouncementComponent = announcement => {
    let announcementElement = announcementTemplate.content.cloneNode(true);
    announcementElement.querySelector('.refAnnouncementDate').innerHTML = announcement.creationDate;
    announcementElement.querySelector('.refAnnouncementType').innerHTML = announcement.annoncementType;
    announcementElement.querySelector('.refAnimalType').innerHTML = announcement.animalDisplayDto.type;
    announcementElement.querySelector('.refAnimalBreed').innerHTML = announcement.animalDisplayDto.breed;
    announcementElement.querySelector('.refAnimalColor').innerHTML = announcement.animalDisplayDto.color;




    announcementContainer.appendChild(announcementElement);

}