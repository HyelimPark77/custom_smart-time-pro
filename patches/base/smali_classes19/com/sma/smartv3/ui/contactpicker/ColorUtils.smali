.class public Lcom/sma/smartv3/ui/contactpicker/ColorUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static mColors:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    const-string v17, "BF360C"

    const-string v18, "37474F"

    const-string v1, "039BE5"

    const-string v2, "0F9D58"

    const-string v3, "4285F4"

    const-string v4, "FF5722"

    const-string v5, "DB4437"

    const-string v6, "689F38"

    const-string v7, "009688"

    const-string v8, "DB4437"

    const-string v9, "3F51B5"

    const-string v10, "9C27B0"

    const-string v11, "4E342E"

    const-string v12, "F50057"

    const-string v13, "42A5F5"

    const-string v14, "009688"

    const-string v15, "9E9D24"

    const-string v16, "00C853"

    filled-new-array/range {v1 .. v18}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/ColorUtils;->mColors:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRandomMaterialColor()I
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/sma/smartv3/ui/contactpicker/ColorUtils;->mColors:[Ljava/lang/String;

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const/16 v3, 0x12

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
