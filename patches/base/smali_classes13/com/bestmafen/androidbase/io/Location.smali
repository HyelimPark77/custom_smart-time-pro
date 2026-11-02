.class public final enum Lcom/bestmafen/androidbase/io/Location;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bestmafen/androidbase/io/Location;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/bestmafen/androidbase/io/Location;

.field public static final enum EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

.field public static final enum INTERNAL:Lcom/bestmafen/androidbase/io/Location;

.field public static final enum PUBLIC:Lcom/bestmafen/androidbase/io/Location;


# direct methods
.method private static final synthetic $values()[Lcom/bestmafen/androidbase/io/Location;
    .locals 3

    sget-object v0, Lcom/bestmafen/androidbase/io/Location;->INTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v1, Lcom/bestmafen/androidbase/io/Location;->EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v2, Lcom/bestmafen/androidbase/io/Location;->PUBLIC:Lcom/bestmafen/androidbase/io/Location;

    filled-new-array {v0, v1, v2}, [Lcom/bestmafen/androidbase/io/Location;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/bestmafen/androidbase/io/Location;

    const-string v1, "INTERNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/androidbase/io/Location;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/androidbase/io/Location;->INTERNAL:Lcom/bestmafen/androidbase/io/Location;

    new-instance v0, Lcom/bestmafen/androidbase/io/Location;

    const-string v1, "EXTERNAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/androidbase/io/Location;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/androidbase/io/Location;->EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

    new-instance v0, Lcom/bestmafen/androidbase/io/Location;

    const-string v1, "PUBLIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/androidbase/io/Location;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/androidbase/io/Location;->PUBLIC:Lcom/bestmafen/androidbase/io/Location;

    invoke-static {}, Lcom/bestmafen/androidbase/io/Location;->$values()[Lcom/bestmafen/androidbase/io/Location;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/androidbase/io/Location;->$VALUES:[Lcom/bestmafen/androidbase/io/Location;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/androidbase/io/Location;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
            "Lcom/bestmafen/androidbase/io/Location;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/bestmafen/androidbase/io/Location;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bestmafen/androidbase/io/Location;
    .locals 1

    const-class v0, Lcom/bestmafen/androidbase/io/Location;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bestmafen/androidbase/io/Location;

    return-object p0
.end method

.method public static values()[Lcom/bestmafen/androidbase/io/Location;
    .locals 1

    sget-object v0, Lcom/bestmafen/androidbase/io/Location;->$VALUES:[Lcom/bestmafen/androidbase/io/Location;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bestmafen/androidbase/io/Location;

    return-object v0
.end method
