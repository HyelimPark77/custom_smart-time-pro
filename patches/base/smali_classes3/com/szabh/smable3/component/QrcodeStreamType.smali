.class public final Lcom/szabh/smable3/component/QrcodeStreamType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/component/QrcodeStreamType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MY_CARD_CODE:I = 0x2

.field public static final NUCLEIC_ACID_CODE:I = 0x0

.field public static final QRCODE_CODE:I = 0x3

.field public static final RECEIPT_CODE:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/QrcodeStreamType;

    invoke-direct {v0}, Lcom/szabh/smable3/component/QrcodeStreamType;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/QrcodeStreamType;->INSTANCE:Lcom/szabh/smable3/component/QrcodeStreamType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getStreamType(ZI)I
    .locals 0

    if-eqz p1, :cond_0

    or-int/lit16 p1, p2, 0x80

    return p1

    :cond_0
    return p2
.end method
