.class public final enum Lcom/bestmafen/baseble/scanner/ScanMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bestmafen/baseble/scanner/ScanMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/bestmafen/baseble/scanner/ScanMode;

.field public static final enum BALANCED:Lcom/bestmafen/baseble/scanner/ScanMode;

.field public static final enum LOW_LATENCY:Lcom/bestmafen/baseble/scanner/ScanMode;

.field public static final enum LOW_POWER:Lcom/bestmafen/baseble/scanner/ScanMode;


# direct methods
.method private static final synthetic $values()[Lcom/bestmafen/baseble/scanner/ScanMode;
    .locals 3

    sget-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_POWER:Lcom/bestmafen/baseble/scanner/ScanMode;

    sget-object v1, Lcom/bestmafen/baseble/scanner/ScanMode;->BALANCED:Lcom/bestmafen/baseble/scanner/ScanMode;

    sget-object v2, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_LATENCY:Lcom/bestmafen/baseble/scanner/ScanMode;

    filled-new-array {v0, v1, v2}, [Lcom/bestmafen/baseble/scanner/ScanMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/bestmafen/baseble/scanner/ScanMode;

    const-string v1, "LOW_POWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/scanner/ScanMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_POWER:Lcom/bestmafen/baseble/scanner/ScanMode;

    new-instance v0, Lcom/bestmafen/baseble/scanner/ScanMode;

    const-string v1, "BALANCED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/scanner/ScanMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->BALANCED:Lcom/bestmafen/baseble/scanner/ScanMode;

    new-instance v0, Lcom/bestmafen/baseble/scanner/ScanMode;

    const-string v1, "LOW_LATENCY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/scanner/ScanMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_LATENCY:Lcom/bestmafen/baseble/scanner/ScanMode;

    invoke-static {}, Lcom/bestmafen/baseble/scanner/ScanMode;->$values()[Lcom/bestmafen/baseble/scanner/ScanMode;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->$VALUES:[Lcom/bestmafen/baseble/scanner/ScanMode;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/bestmafen/baseble/scanner/ScanMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bestmafen/baseble/scanner/ScanMode;
    .locals 1

    const-class v0, Lcom/bestmafen/baseble/scanner/ScanMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bestmafen/baseble/scanner/ScanMode;

    return-object p0
.end method

.method public static values()[Lcom/bestmafen/baseble/scanner/ScanMode;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->$VALUES:[Lcom/bestmafen/baseble/scanner/ScanMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bestmafen/baseble/scanner/ScanMode;

    return-object v0
.end method
