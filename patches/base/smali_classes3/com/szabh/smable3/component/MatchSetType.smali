.class public final Lcom/szabh/smable3/component/MatchSetType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CLASSIC_MATCH:I = 0x1

.field public static final CLASSIC_MATCH_V3:I = 0x7

.field public static final FIELD_HOCKEY_MATCH:I = 0xb

.field public static final FUTSAL_MATCH:I = 0xa

.field public static final GUEST_TEAM_PLAYER_LIST:I = 0x5

.field public static final HOME_TEAM_PLAYER_LIST:I = 0x4

.field public static final INSTANCE:Lcom/szabh/smable3/component/MatchSetType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INTERVAL_TRAINING:I = 0x3

.field public static final INTERVAL_TRAINING_V3:I = 0x9

.field public static final PLAYER_LIST_V3:I = 0xff

.field public static final PRO_MATCH:I = 0x2

.field public static final PRO_MATCH_V3:I = 0x8

.field public static final RUGBY_MATCH:I = 0xc

.field public static final YOUTH_MATCH:I = 0x0

.field public static final YOUTH_MATCH_V3:I = 0x6


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/MatchSetType;

    invoke-direct {v0}, Lcom/szabh/smable3/component/MatchSetType;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/MatchSetType;->INSTANCE:Lcom/szabh/smable3/component/MatchSetType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
