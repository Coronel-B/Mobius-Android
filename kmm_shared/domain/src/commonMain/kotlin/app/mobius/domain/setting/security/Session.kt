package app.mobius.domain.setting.security

import com.benasher44.uuid.Uuid

/**
 * TODO: Check whether to rename some type of authorization
 */
class Session(
    val uuid: Uuid?,
    val accessToken: AccessToken,
    val dailyReloadToken: DailyReloadToken,
    val monthlyReloadToken: MonthlyReloadToken,
)

/**
 * Represents the dataAccess token or AT
 * Expires in 5 minutes
 * OBS: Dont use AccessToken as name to avoid conflicts of mapping TODO
 * @param token: Access token or API key to identify the person
 */
class AccessToken(
    val uuid: Uuid?,
    val token: Token
)

/**
 * Represents a daily token to reload the AT
 * @param keepSessionDaily: Expires in 1 day but is optional for the person
 */
class DailyReloadToken(
    val uuid: Uuid?,
    val keepSessionDaily: Boolean = false,
    val token: Token
)

/**
 * Represents a monthly token to reload the dailyReloadToken
 * Obs: Expires in 1 month
 */
class MonthlyReloadToken(
    val uuid: Uuid?,
    val token: Token
)