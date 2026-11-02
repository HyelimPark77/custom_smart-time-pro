.class public final enum Lcom/szabh/smable3/BleCommand;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/BleCommand;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleCommand\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,519:1\n3919#2:520\n4434#2,2:521\n*S KotlinDebug\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleCommand\n*L\n17#1:520\n17#1:521,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleCommand\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,519:1\n3919#2:520\n4434#2,2:521\n*S KotlinDebug\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleCommand\n*L\n17#1:520\n17#1:521,2\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/BleCommand;

.field public static final enum CONNECT:Lcom/szabh/smable3/BleCommand;

.field public static final enum CONTROL:Lcom/szabh/smable3/BleCommand;

.field public static final enum DATA:Lcom/szabh/smable3/BleCommand;

.field public static final enum IO:Lcom/szabh/smable3/BleCommand;

.field public static final enum NONE:Lcom/szabh/smable3/BleCommand;

.field public static final enum PUSH:Lcom/szabh/smable3/BleCommand;

.field public static final enum SET:Lcom/szabh/smable3/BleCommand;

.field public static final enum UPDATE:Lcom/szabh/smable3/BleCommand;


# instance fields
.field private final mBleCommand:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/BleCommand;
    .locals 8

    sget-object v0, Lcom/szabh/smable3/BleCommand;->UPDATE:Lcom/szabh/smable3/BleCommand;

    sget-object v1, Lcom/szabh/smable3/BleCommand;->SET:Lcom/szabh/smable3/BleCommand;

    sget-object v2, Lcom/szabh/smable3/BleCommand;->CONNECT:Lcom/szabh/smable3/BleCommand;

    sget-object v3, Lcom/szabh/smable3/BleCommand;->PUSH:Lcom/szabh/smable3/BleCommand;

    sget-object v4, Lcom/szabh/smable3/BleCommand;->DATA:Lcom/szabh/smable3/BleCommand;

    sget-object v5, Lcom/szabh/smable3/BleCommand;->CONTROL:Lcom/szabh/smable3/BleCommand;

    sget-object v6, Lcom/szabh/smable3/BleCommand;->IO:Lcom/szabh/smable3/BleCommand;

    sget-object v7, Lcom/szabh/smable3/BleCommand;->NONE:Lcom/szabh/smable3/BleCommand;

    filled-new-array/range {v0 .. v7}, [Lcom/szabh/smable3/BleCommand;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "UPDATE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->UPDATE:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "SET"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->SET:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "CONNECT"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->CONNECT:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "PUSH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->PUSH:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "DATA"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->DATA:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "CONTROL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->CONTROL:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "IO"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->IO:Lcom/szabh/smable3/BleCommand;

    new-instance v0, Lcom/szabh/smable3/BleCommand;

    const-string v1, "NONE"

    const/16 v2, 0xff

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/BleCommand;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/BleCommand;->NONE:Lcom/szabh/smable3/BleCommand;

    invoke-static {}, Lcom/szabh/smable3/BleCommand;->$values()[Lcom/szabh/smable3/BleCommand;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/BleCommand;->$VALUES:[Lcom/szabh/smable3/BleCommand;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/BleCommand;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/szabh/smable3/BleCommand;->mBleCommand:I

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
            "Lcom/szabh/smable3/BleCommand;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/BleCommand;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/BleCommand;
    .locals 1

    const-class v0, Lcom/szabh/smable3/BleCommand;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/BleCommand;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/BleCommand;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/BleCommand;->$VALUES:[Lcom/szabh/smable3/BleCommand;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/BleCommand;

    return-object v0
.end method


# virtual methods
.method public final getBleKeys()Ljava/util/List;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/BleKey;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/BleKey;->values()[Lcom/szabh/smable3/BleKey;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lcom/szabh/smable3/BleKey;->getMKey()I

    move-result v5

    ushr-int/lit8 v5, v5, 0x8

    iget v6, p0, Lcom/szabh/smable3/BleCommand;->mBleCommand:I

    if-ne v5, v6, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getMBleCommand()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/BleCommand;->mBleCommand:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget v1, p0, Lcom/szabh/smable3/BleCommand;->mBleCommand:I

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
