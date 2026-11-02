.class public final Lcom/szabh/smable3/entity/MenstrualPeriodType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/entity/MenstrualPeriodType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MENSTRUATION:I = 0x0

.field public static final OVULATION:I = 0x1

.field public static final SAFETY:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/entity/MenstrualPeriodType;

    invoke-direct {v0}, Lcom/szabh/smable3/entity/MenstrualPeriodType;-><init>()V

    sput-object v0, Lcom/szabh/smable3/entity/MenstrualPeriodType;->INSTANCE:Lcom/szabh/smable3/entity/MenstrualPeriodType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
