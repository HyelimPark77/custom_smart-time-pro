.class public Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LIGHT_MODE_COLOURFUL:I = 0x0

.field public static final LIGHT_MODE_SCENE:I = 0x2

.field public static final LIGHT_MODE_TWINKLE:I = 0x1

.field public static final SCENE_MODE_BEAUTIFUL_SUNSET:I = 0xa

.field public static final SCENE_MODE_BLUE_BREATHING:I = 0x8

.field public static final SCENE_MODE_CANDLELIGHT:I = 0x2

.field public static final SCENE_MODE_COLORFUL_BREATHING:I = 0x5

.field public static final SCENE_MODE_GREEN_BREATHING:I = 0x7

.field public static final SCENE_MODE_GREEN_MOOD:I = 0x9

.field public static final SCENE_MODE_HEARTBEAT:I = 0x1

.field public static final SCENE_MODE_MUSIC_RHYTHM:I = 0xb

.field public static final SCENE_MODE_NIGHT_LIGHT:I = 0x3

.field public static final SCENE_MODE_RAINBOW:I = 0x0

.field public static final SCENE_MODE_RED_BREATHING:I = 0x6

.field public static final SCENE_MODE_STAGE:I = 0x4

.field public static final STATE_OFF:I = 0x0

.field public static final STATE_ON:I = 0x1

.field public static final STATE_SETTING:I = 0x2

.field public static final TWINKLE_FREQ_BREATHE:I = 0x2

.field public static final TWINKLE_FREQ_FAST:I = 0x0

.field public static final TWINKLE_FREQ_MUSIC:I = 0x3

.field public static final TWINKLE_FREQ_SLOW:I = 0x1

.field public static final TWINKLE_MODE_BLUE:I = 0x6

.field public static final TWINKLE_MODE_COLORFUL:I = 0x0

.field public static final TWINKLE_MODE_CYAN:I = 0x5

.field public static final TWINKLE_MODE_GREEN:I = 0x4

.field public static final TWINKLE_MODE_ORANGE:I = 0x2

.field public static final TWINKLE_MODE_PURPLE:I = 0x7

.field public static final TWINKLE_MODE_RED:I = 0x1

.field public static final TWINKLE_MODE_YELLOW:I = 0x3


# instance fields
.field private color:I

.field private hue:I

.field private lightMode:I

.field private luminance:I

.field private saturation:I

.field private sceneMode:I

.field private switchState:I

.field private twinkleFreq:I

.field private twinkleMode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getColor()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->color:I

    return v0
.end method

.method public getHue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->hue:I

    return v0
.end method

.method public getLightMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->lightMode:I

    return v0
.end method

.method public getLuminance()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->luminance:I

    return v0
.end method

.method public getSaturation()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->saturation:I

    return v0
.end method

.method public getSceneMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->sceneMode:I

    return v0
.end method

.method public getSwitchState()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->switchState:I

    return v0
.end method

.method public getTwinkleFreq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleFreq:I

    return v0
.end method

.method public getTwinkleMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleMode:I

    return v0
.end method

.method public setColor(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->color:I

    return-object p0
.end method

.method public setHue(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->hue:I

    return-object p0
.end method

.method public setLightMode(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->lightMode:I

    return-object p0
.end method

.method public setLuminance(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->luminance:I

    return-object p0
.end method

.method public setSaturation(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->saturation:I

    return-object p0
.end method

.method public setSceneMode(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->sceneMode:I

    return-object p0
.end method

.method public setSwitchState(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->switchState:I

    return-object p0
.end method

.method public setTwinkleFreq(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleFreq:I

    return-object p0
.end method

.method public setTwinkleMode(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleMode:I

    return-object p0
.end method

.method public toByteArray()[B
    .locals 6

    const/16 v0, 0xb

    new-array v0, v0, [B

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->switchState:I

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->lightMode:I

    const/4 v3, 0x2

    shl-int/2addr v2, v3

    or-int/2addr v1, v2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->hue:I

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v4, 0x0

    aput-byte v1, v0, v4

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->color:I

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v5, 0x1

    aput-byte v1, v0, v5

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->color:I

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->color:I

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x3

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleMode:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x4

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleFreq:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x5

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->sceneMode:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x6

    aput-byte v1, v0, v3

    array-length v1, v2

    const/4 v3, 0x7

    invoke-static {v2, v4, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->saturation:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/16 v2, 0x9

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->luminance:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/16 v2, 0xa

    aput-byte v1, v0, v2

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LightControlInfo{switchState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->switchState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lightMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->lightMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->color:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", twinkleMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", twinkleFreq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->twinkleFreq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->hue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", saturation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->saturation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", luminance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->luminance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
