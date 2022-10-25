FROM node:16
WORKDIR  /home/node/app
COPY . /home/node/app
RUN npm install
RUN chmod +x /home/node/app/node_modules/.bin/nodemon
CMD ["npm", "start"]
