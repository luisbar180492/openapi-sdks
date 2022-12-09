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
	npm install @luisbar180492/openapi-sdk@1.0.24
	```

- More info [here](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-npm-registry)

Do not forget to change the owner name by yours

## How to use the Java SDK?

- Create a new project with Maven
- Create Github token from Settings > Developer Settings > Personal Access Token
  - You must use a personal access token (classic) with the appropriate scopes to publish and install packages in GitHub Packages
- All the steps that are explained down below must be applied in the `settings.xml` file, which is located in `YOUR_USER_HOME/.m2/` (e.g. `/Users/guest/.m2/settings.xml`)
- Copy the user and token got from Github
```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_USERNAME</username>
      <password>YOUR_TOKEN</password>
    </server>
  </servers>
</settings>
```
- Copy the following profile item into your profiles tag
```xml
<profile>
	<id>github</id>
	<repositories>
		<repository>
			<id>central</id>
			<url>https://repo1.maven.org/maven2</url>
		</repository>
		<repository>
			<id>github</id>
			<url>https://maven.pkg.github.com/ORGANIZATION_NAME_OR_USERNAME/packages</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
	</repositories>
</profile>
```
- Activate the profile pasting the following snippet
```xml
<activeProfiles>
  <activeProfile>github</activeProfile>
</activeProfiles>
```
- Copy the dependency into your `pom.xml` file
```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-sdk</artifactId>
  <version>1.0.24</version>
</dependency>
```

- More info [here](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry)


## Todo
[ ] Send dll to Nuget server