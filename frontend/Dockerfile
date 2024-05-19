# Define Image where the new Image is based on
FROM node:20.10.0
# Create app directory for the Container
WORKDIR /usr/src/app
# Copy All content from Frontend-Folder to app directory
COPY . .
# Install the App
RUN npm install
# Docker Run Command to start the App
EXPOSE 8080
CMD [ "npm", "run", "start" ]