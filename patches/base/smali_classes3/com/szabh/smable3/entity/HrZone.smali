.class public final enum Lcom/szabh/smable3/entity/HrZone;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/HrZone;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/HrZone;

.field public static final enum HARD:Lcom/szabh/smable3/entity/HrZone;

.field public static final enum LOW:Lcom/szabh/smable3/entity/HrZone;

.field public static final enum MAXIMUM:Lcom/szabh/smable3/entity/HrZone;

.field public static final enum MODERATE:Lcom/szabh/smable3/entity/HrZone;

.field public static final enum NORMAL:Lcom/szabh/smable3/entity/HrZone;


# instance fields
.field private final zone:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/HrZone;
    .locals 5

    sget-object v0, Lcom/szabh/smable3/entity/HrZone;->LOW:Lcom/szabh/smable3/entity/HrZone;

    sget-object v1, Lcom/szabh/smable3/entity/HrZone;->NORMAL:Lcom/szabh/smable3/entity/HrZone;

    sget-object v2, Lcom/szabh/smable3/entity/HrZone;->MODERATE:Lcom/szabh/smable3/entity/HrZone;

    sget-object v3, Lcom/szabh/smable3/entity/HrZone;->HARD:Lcom/szabh/smable3/entity/HrZone;

    sget-object v4, Lcom/szabh/smable3/entity/HrZone;->MAXIMUM:Lcom/szabh/smable3/entity/HrZone;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/szabh/smable3/entity/HrZone;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/HrZone;

    const-string v1, "LOW"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/HrZone;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->LOW:Lcom/szabh/smable3/entity/HrZone;

    new-instance v0, Lcom/szabh/smable3/entity/HrZone;

    const-string v1, "NORMAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/HrZone;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->NORMAL:Lcom/szabh/smable3/entity/HrZone;

    new-instance v0, Lcom/szabh/smable3/entity/HrZone;

    const-string v1, "MODERATE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/HrZone;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->MODERATE:Lcom/szabh/smable3/entity/HrZone;

    new-instance v0, Lcom/szabh/smable3/entity/HrZone;

    const-string v1, "HARD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/HrZone;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->HARD:Lcom/szabh/smable3/entity/HrZone;

    new-instance v0, Lcom/szabh/smable3/entity/HrZone;

    const-string v1, "MAXIMUM"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/HrZone;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->MAXIMUM:Lcom/szabh/smable3/entity/HrZone;

    invoke-static {}, Lcom/szabh/smable3/entity/HrZone;->$values()[Lcom/szabh/smable3/entity/HrZone;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->$VALUES:[Lcom/szabh/smable3/entity/HrZone;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/HrZone;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/szabh/smable3/entity/HrZone;->zone:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/szabh/smable3/entity/HrZone;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/HrZone;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/HrZone;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/HrZone;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/HrZone;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/HrZone;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/HrZone;->$VALUES:[Lcom/szabh/smable3/entity/HrZone;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/HrZone;

    return-object v0
.end method


# virtual methods
.method public final getZone()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/HrZone;->zone:I

    return v0
.end method
