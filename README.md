Characters
GET /api/characters

    Description: Fetches all characters.
    Response: List of all Characters.

GET /api/characters/{id}

    Description: Fetches a character by its ID.
    Parameters:
        id: ID of the character.
    

DELETE /api/characters/{id}

    Description: Deletes a character by its ID.
    Parameters:
        id: Long - ID of the character.
    

Combats
GET api/combat/{characterId}/history

    Description: Fetches combat history for a given character.
    Parameters:
        characterId: Long - ID of the character.
    Response: List all Combats from the character.

GET api/combat/{characterId}/attack

    Description: Calculates the attack value for a character.
    Parameters:
        characterId: Long - ID of the character.
    Response: Attack value.

GET api/combat/{characterId}/defense

    Description: Calculates the defense value for a character.
    Parameters:
        characterId: Long - ID of the character.
    Response: Defense value.

POST api/combat/{attackerId}/{defenderId}

    Description: Generates the combat turn
    Parameters:
        attackerId: ID of the attacker.
        defenderId: ID of the defender.
    Response: Combat log.

Players
GET api/players

    Description: Fetches all players.
    Response: List of PlayerResponseDTO objects.

POST api/players

    Description: Creates a new player.
    Request Body: {
    "name": "string",
    "email": "string",
    "password": "string"
}
    Response: PlayerCreateDTO object.

PATCH api/players/{playerId}

    Description: Adds a character to a player.
    Parameters:
        playerId: UUID - ID of the player.
    Request Body: 
                    {name: String
                    hp: Integer
                    str: Integer
                    def: Integer
                    agi: Integer
                    dices: Integer
                    faces: Integer}

Monsters
Giants
GET api/characters/giant

    Description: Fetches all giants.
    Response: List of Giants.

POST api/characters/giant

    Description: Creates a new giant.
    Request Body: {
    name: string
            }
    

Orcs
GET api/characters/orc

    Description: Fetches all orcs.
    Response: List of all Orcs.

POST api/characters/orc

    Description: Creates a new orc.
    Request Body: {
    name: string
            }
    Response: Created Orc.

Werewolves
GET api/characters/werewolf

    Description: Fetches all werewolves.
    Response: List of all Werewolfs.

POST api/characters/werewolf

    Description: Creates a new werewolf.
    Request Body: {
    name: string
            }.
   

Heroes
Warriors
GET api/characters/warrior


    Description: Fetches all warriors.
    Response: List of all Warriors.

POST api/characters/warrior

    Description: Creates a new warrior.
    Request Body: {
    name: string
            }

Knights
GET api/characters/knight

    Description: Fetches all knights.
    Response: List of all knights.

POST api/characters/knight

    Description: Creates a new knight.
    Request Body: {
    name: string
            }

Barbarians
GET api/characters/barbarian

    Description: Fetches all barbarians.
    Response: List of all barbarians.

POST api/characters/barbarian

    Description: Creates a new barbarian.
    Request Body: {
    name: string
            }
    