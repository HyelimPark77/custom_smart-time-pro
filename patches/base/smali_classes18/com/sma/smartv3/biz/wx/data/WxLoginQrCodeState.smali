.class public final enum Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum Error:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum ExitScanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum NotScanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum Scanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum Scanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum TimeOut:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum Unknown:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

.field public static final enum Verification:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;


# instance fields
.field private value:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
    .locals 8

    sget-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->NotScanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v2, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v3, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->ExitScanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v4, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Verification:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v5, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->TimeOut:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v6, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Unknown:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    sget-object v7, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Error:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    filled-new-array/range {v0 .. v7}, [Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const-string v1, "NotScanned"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->NotScanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const-string v1, "Scanning"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const-string v1, "Scanned"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const-string v1, "ExitScanning"

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->ExitScanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const-string v1, "Verification"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Verification:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const/4 v1, 0x5

    const/16 v2, 0xc8

    const-string v3, "TimeOut"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->TimeOut:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const/4 v1, 0x6

    const/16 v2, 0xc9

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Unknown:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    const/4 v1, 0x7

    const/16 v2, 0xca

    const-string v3, "Error"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Error:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    invoke-static {}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->$values()[Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->$VALUES:[Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->value:I

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
            "Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
    .locals 1

    const-class v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->$VALUES:[Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->value:I

    return v0
.end method

.method public final setValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->value:I

    return-void
.end method
