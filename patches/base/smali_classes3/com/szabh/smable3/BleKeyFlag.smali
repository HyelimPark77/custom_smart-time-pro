.class public final enum Lcom/szabh/smable3/BleKeyFlag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/BleKeyFlag$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/BleKeyFlag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/BleKeyFlag;

.field public static final enum CREATE:Lcom/szabh/smable3/BleKeyFlag;

.field public static final Companion:Lcom/szabh/smable3/BleKeyFlag$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum DELETE:Lcom/szabh/smable3/BleKeyFlag;

.field public static final enum NONE:Lcom/szabh/smable3/BleKeyFlag;

.field public static final enum READ:Lcom/szabh/smable3/BleKeyFlag;

.field public static final enum READ_CONTINUE:Lcom/szabh/smable3/BleKeyFlag;

.field public static final enum RESET:Lcom/szabh/smable3/BleKeyFlag;

.field public static final enum UPDATE:Lcom/szabh/smable3/BleKeyFlag;


# instance fields
.field private final mBleKeyFlag:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/BleKeyFlag;
    .locals 7

    sget-object v0, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v1, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ_CONTINUE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->RESET:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v6, Lcom/szabh/smable3/BleKeyFlag;->NONE:Lcom/szabh/smable3/BleKeyFlag;

    filled-new-array/range {v0 .. v6}, [Lcom/szabh/smable3/BleKeyFlag;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const-string v1, "UPDATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const/4 v1, 0x1

    const/16 v2, 0x10

    const-string v3, "READ"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const/4 v1, 0x2

    const/16 v2, 0x11

    const-string v3, "READ_CONTINUE"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->READ_CONTINUE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const/4 v1, 0x3

    const/16 v2, 0x20

    const-string v3, "CREATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const/4 v1, 0x4

    const/16 v2, 0x30

    const-string v3, "DELETE"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const/4 v1, 0x5

    const/16 v2, 0x40

    const-string v3, "RESET"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->RESET:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag;

    const/4 v1, 0x6

    const/16 v2, 0xff

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/BleKeyFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->NONE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {}, Lcom/szabh/smable3/BleKeyFlag;->$values()[Lcom/szabh/smable3/BleKeyFlag;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->$VALUES:[Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/BleKeyFlag$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/BleKeyFlag$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/BleKeyFlag;->Companion:Lcom/szabh/smable3/BleKeyFlag$OXO1;

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

    iput p3, p0, Lcom/szabh/smable3/BleKeyFlag;->mBleKeyFlag:I

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
            "Lcom/szabh/smable3/BleKeyFlag;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/BleKeyFlag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/BleKeyFlag;
    .locals 1

    const-class v0, Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/BleKeyFlag;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/BleKeyFlag;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/BleKeyFlag;->$VALUES:[Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/BleKeyFlag;

    return-object v0
.end method


# virtual methods
.method public final getMBleKeyFlag()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/BleKeyFlag;->mBleKeyFlag:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget v1, p0, Lcom/szabh/smable3/BleKeyFlag;->mBleKeyFlag:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "0x%02X_"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
