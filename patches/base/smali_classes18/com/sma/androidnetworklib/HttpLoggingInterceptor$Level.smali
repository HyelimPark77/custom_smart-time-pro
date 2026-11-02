.class public final enum Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/androidnetworklib/HttpLoggingInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Level"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

.field public static final enum BASIC:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

.field public static final enum BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

.field public static final enum CUSTOM:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

.field public static final enum HEADERS:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

.field public static final enum NONE:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;


# direct methods
.method private static synthetic $values()[Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
    .locals 5

    sget-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->NONE:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    sget-object v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BASIC:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    sget-object v2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->HEADERS:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    sget-object v3, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    sget-object v4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->CUSTOM:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->NONE:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    new-instance v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const-string v1, "BASIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BASIC:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    new-instance v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const-string v1, "HEADERS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->HEADERS:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    new-instance v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const-string v1, "BODY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    new-instance v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const-string v1, "CUSTOM"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->CUSTOM:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-static {}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->$values()[Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    move-result-object v0

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->$VALUES:[Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

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
            null,
            null
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

.method public static valueOf(Ljava/lang/String;)Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            null
        }
    .end annotation

    const-class v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    return-object p0
.end method

.method public static values()[Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
    .locals 1

    sget-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->$VALUES:[Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-virtual {v0}, [Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    return-object v0
.end method
