.class public final enum Lcom/sma/smartv3/ui/contactpicker/LimitColumn;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/contactpicker/LimitColumn;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

.field public static final enum EMAIL:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

.field public static final enum NONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

.field public static final enum PHONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;


# direct methods
.method private static synthetic $values()[Lcom/sma/smartv3/ui/contactpicker/LimitColumn;
    .locals 3

    sget-object v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->EMAIL:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    sget-object v1, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->PHONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    sget-object v2, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->NONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    const-string v1, "EMAIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->EMAIL:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    const-string v1, "PHONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->PHONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->NONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    invoke-static {}, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->$values()[Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->$VALUES:[Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "$enum$name",
            "$enum$ordinal"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/contactpicker/LimitColumn;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    const-class v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/contactpicker/LimitColumn;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->$VALUES:[Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    invoke-virtual {v0}, [Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    return-object v0
.end method
