## How to update SDKs?

1. Install nvm

2. Install node

    `nvm install && nvm use`

3. Install dependencies

    `npm i`

4. Update openapi.yaml file

5. Run

    `npm run generate:clients`

## Gotchas

- Do not forget to specify the owner of the package before the package name, for instance `@owner/package`
- If you want to push your Javascript code to a repository using a different name of your package name, you have to set the `repository` property on the `package.json` file
- If you reveive error 429 when you are trying to deploy Java SDK, that is because you are trying to upload a repeated version of the artifact

## How to customized generated code?

 - If you want to customize the code generate, you could modify the templates which are located on `templates/*`
 - If you want to modify another files, you can download the templates [here](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources)
 - Templates were built using [Mustache](https://mustache.github.io)

## How to use the Javascript SDK?

- Create a node project
	```bash
	mkdir new-project && cd ./new-project && npm init -y
	```

- Create or edit the `.npmrc` file to include a line specifying GitHub Packages URL and the account owner, as shown the following line
	```
	@luisbar180492:registry=https://npm.pkg.github.com
	```
        
- Authenticate using the user and token (you have to create the token on Github)
	```bash
	npm login --scope=@luisbar180492 --registry=https://npm.pkg.github.com
	```
        
- Install de package
	```bash
	npm install openapi-sdk@1.0.0
	```

Do not forget to change the owner name by yours